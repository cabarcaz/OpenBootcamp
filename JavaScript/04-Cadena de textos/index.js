const nombre = 'Camilo';
const apellido = 'Abarca';
const estudiante = nombre.concat(" ").concat(apellido);

const estudianteMayusculas = estudiante.toUpperCase();
const estudianteMinusculas = estudiante.toLowerCase();

const estudianteLength = estudiante.length

const letraInicialNombre = nombre.substring(0,1);
const letraFinalApellido = apellido.substring(apellido.length -1, apellido.length);
const sinEspacio = estudiante.replace(/ /g, "");
const nombreEstudiante = nombre.includes(nombre);