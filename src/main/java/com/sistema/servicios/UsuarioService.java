
package com.sistema.servicios;

import com.sistema.entidades.Usuario;
import com.sistema.entidades.UsuarioRol;
import java.util.Set;


public interface UsuarioService {
    
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;
    
}
