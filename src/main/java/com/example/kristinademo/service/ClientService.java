package com.example.kristinademo.service;

import com.example.kristinademo.dto.ClientDto;
import com.example.kristinademo.model.Client;
import com.example.kristinademo.repository.ClientRepository;

import java.util.List;

public interface ClientService {
    //     * Создает нового клиента
//     * @param client - клиент для создания
//     */
    void create(ClientDto clientDto);

    //
//    /**
//     * Возвращает список всех имеющихся клиентов
//     * @return список клиентов
//     */
    List<ClientDto> readAll();

    //
//    /**
//     * Возвращает клиента по его ID
//     * @param id - ID клиента
//     * @return - объект клиента с заданным ID
//     */
    ClientDto readId(long id);

    //
//    /**
//     * Обновляет клиента с заданным ID,
//     * в соответствии с переданным клиентом
//     * @param client - клиент в соответсвии с которым нужно обновить данные
//     * @param id - id клиента которого нужно обновить
//     * @return - true если данные были обновлены, иначе false
//     */
    boolean update(long clientId);

    //
//    /**
//     * Удаляет клиента с заданным ID
//     * @param id - id клиента, которого нужно удалить
//     * @return - true если клиент был удален, иначе false
//     */
    boolean delete(long clientId);

    List<ClientDto> sorted(String sorted);

}
