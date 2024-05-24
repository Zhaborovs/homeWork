package ru.tree;

import java.io.*;
//сгенерированно при помощи ии

// Класс, который будет сериализовать и десериализовать объекты
class FileHandler {
    // Метод для сериализации объекта в файл
    public void save(Object object, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(object);
            System.out.println("Объект успешно сериализован в файл: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации объекта из файла
    public Object load(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object deserializedObject = inputStream.readObject();
            System.out.println("Объект успешно десериализован из файла: " + fileName);
            return deserializedObject;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
