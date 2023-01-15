package com.example.kristinademo.service;

import com.example.kristinademo.dto.TopicDto;
import com.example.kristinademo.model.Topic;

import java.util.List;

public interface TopicService {
    //     * Создает нового клиента
//     * @param Topic - клиент для создания
//     */
    void create(TopicDto topicDto);
    //
//    /**
//     * Возвращает список всех имеющихся клиентов
//     * @return список клиентов
//     */
    List<TopicDto> readAll();
    //
//    /**
//     * Возвращает клиента по его ID
//     * @param id - ID клиента
//     * @return - объект клиента с заданным ID
//     */
    TopicDto readId(long topicId);
    //
//    /**
//     * Обновляет клиента с заданным ID,
//     * в соответствии с переданным клиентом
//     * @param Topic - клиент в соответсвии с которым нужно обновить данные
//     * @param id - id клиента которого нужно обновить
//     * @return - true если данные были обновлены, иначе false
//     */
    boolean update(long topicId);
    //
//    /**
//     * Удаляет клиента с заданным ID
//     * @param id - id клиента, которого нужно удалить
//     * @return - true если клиент был удален, иначе false
//     */
    boolean delete(long topicId);

    List<TopicDto> findThemes(String findThemes);

}
