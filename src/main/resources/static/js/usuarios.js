// Call the dataTables jQuery plugin
let usuariosHtml
$(document).ready(function() {
  cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios(){
    console.log("Cargar usuarios")
    const request = await fetch("http://localhost:8080/usuarios")
    const usuarios = await request.json()
    console.log(usuarios)
    usuariosHtml = usuarios.map( usuario => `<tr><td>${usuario.id}</td><td>${usuario.nombre} ${usuario.apellido}</td><td>${usuario.mail}</td><td>${usuario.telefono}</td><td><a href='#' class='btn btn-danger btn-circle btn-sm'><i class='fas fa-trash'></i></a></td></tr>`).join()
    console.log(usuariosHtml)
    document.querySelector("#usuarios tbody").outerHTML = usuariosHtml
}