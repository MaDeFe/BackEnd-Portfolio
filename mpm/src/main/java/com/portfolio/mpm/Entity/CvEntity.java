package com.portfolio.mpm.Entity;

import javax.lang.model.SourceVersion;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class CvEntity {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "long max excedida")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "long max excedida")
    private String apellido;
    
    
    private String img;

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
    */
}
