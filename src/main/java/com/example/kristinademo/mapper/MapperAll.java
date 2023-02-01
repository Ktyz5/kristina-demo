package com.example.kristinademo.mapper;


import java.util.List;

public interface MapperAll<A, B> {
    A mapperDTO(B type);

    B mapperType(A dto);

    List<A> mapperListDto(List<B> type);

    List<B> mapperListType(List<A> dto);

}
