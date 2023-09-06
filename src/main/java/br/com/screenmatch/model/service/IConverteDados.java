package br.com.screenmatch.model.service;

public interface IConverteDados {
    <T> T obterDados(String json,Class<T> classe);
}
