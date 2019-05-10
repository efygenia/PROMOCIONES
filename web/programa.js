class Promociones {
    static main(){
        document.querySelector("#consultarBtn").setAttribute("onclick", "Promociones.consultar();");
           }
    static consultar(){
        console.log("Estas por consultar Promociones");
        fetch("Promociones",{method:"GET"})
    };
}

Promociones.main();


