package com.challenge.literatura.config.iConfig;

public interface convertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase); //metodo generico que coje el json y convierte en datos Java ya que no se sabe que retornara

}
