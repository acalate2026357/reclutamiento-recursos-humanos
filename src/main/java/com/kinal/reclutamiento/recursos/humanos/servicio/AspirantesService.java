
package main.java.com.kinal.reclutamiento.recursos.humanos.servicio;

import main.java.com.kinal.reclutamiento.recursos.humanos.repositorio.AspiranteRepository;

    public class AspirantesService {

    private final AspiranteRepository aspiranteRepository;

    public AspirantesService() {
        this.aspiranteRepository = new AspiranteRepository();
    }

    public boolean autenticarAspirante(String correo, String contrasena) {
        if (correo == null || correo.trim().isEmpty() || contrasena == null || contrasena.trim().isEmpty()) {
            return false;
        }
        return aspiranteRepository.validarLogin(correo, contrasena);
    }
}

