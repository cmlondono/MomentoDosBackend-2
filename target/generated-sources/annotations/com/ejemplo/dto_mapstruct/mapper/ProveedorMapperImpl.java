package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProveedorDTO;
import com.ejemplo.dto_mapstruct.entity.Proveedor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-10-10T15:13:57-0500",
    comments = "version: 1.6.2, compiler: javac, environment: Java 23.0.2 (Oracle Corporation)"
)
@Component
public class ProveedorMapperImpl implements ProveedorMapper {

    @Override
    public ProveedorDTO toDTO(Proveedor proveedor) {
        if ( proveedor == null ) {
            return null;
        }

        ProveedorDTO proveedorDTO = new ProveedorDTO();

        proveedorDTO.setId( proveedor.getId() );
        proveedorDTO.setNombre( proveedor.getNombre() );
        proveedorDTO.setTelefono( proveedor.getTelefono() );
        proveedorDTO.setCorreo( proveedor.getCorreo() );

        return proveedorDTO;
    }

    @Override
    public Proveedor toEntity(ProveedorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Proveedor proveedor = new Proveedor();

        proveedor.setId( dto.getId() );
        proveedor.setNombre( dto.getNombre() );
        proveedor.setTelefono( dto.getTelefono() );
        proveedor.setCorreo( dto.getCorreo() );

        return proveedor;
    }
}
