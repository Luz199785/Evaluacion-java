public class Usuario {
  private String nombreUsuario;
  private String contrasena;
  private String nombre;
  private String apellido;
  private String correoElectronico;

  public Usuario(String nombreUsuario, String contrasena, String nombre, String apellido, String correoElectronico) {
    this.nombreUsuario = nombreUsuario;
    this.contrasena = contrasena;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correoElectronico = correoElectronico;
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public String getContrasena() {
    return contrasena;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCorreoElectronico() {
    return correoElectronico;
  }
}

public class Profesor extends Usuario {
  private String departamento;

  public Profesor(String nombreUsuario, String contrasena, String nombre, String apellido, String correoElectronico, String departamento) {
    super(nombreUsuario, contrasena, nombre, apellido, correoElectronico);
    this.departamento = departamento;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  // Métodos para consultar y modificar información del profesor
}

public class Estudiante extends Usuario {
  private String carrera;
  private int semestre;

  public Estudiante(String nombreUsuario, String contrasena, String nombre, String apellido, String correoElectronico, String carrera, int semestre) {
    super(nombreUsuario, contrasena, nombre, apellido, correoElectronico);
    this.carrera = carrera;
    this.semestre = semestre;
  }

  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  // Métodos para consultar y modificar información del estudiante
}

public class PlataformaVirtual {
  private List<Profesor> profesores;
  private List<Estudiante> estudiantes;

  public PlataformaVirtual() {
    this.profesores = new ArrayList<>();
    this.estudiantes = new ArrayList<>();
  }

  public void agregarProfesor(Profesor profesor) {
    profesores.add(profesor);
  }

  public void agregarEstudiante(Estudiante estudiante) {
    estudiantes.add(estudiante);
  }

  public List<Profesor> getProfesores() {
    return profesores;
  }

  public List<Estudiante> getEstudiantes() {
    return estudiantes;
  }

  // Métodos para consultar y modificar información de la plataforma virtual
}
