import { useState } from "react"
import "./style.css"

export default function InfoCurso () {
    /* 
    Criando varivaies
    useState modifica apenas um elemento -> funcões que sera mudada apenas em um elemento
    chamando o Hook -> Funcões criadas para acompanhar as funcões para mudar e mostrar o que foi mudado.
    setNome = colocar valores dentro da variavel
    */
    const [nome, setNome ] = useState("Desenvolvimento de Sistema") 
    const [cargaHoraria, setcargaHoraria ] = useState("158")
    const [local, setLocal ] = useState("SENAI")

    return(
        <div className="info-curso">
        <h1>Dados do Curso</h1>
        <p><strong>Nome:</strong> { nome }</p>
        <p><strong>Carga Horária: </strong> { cargaHoraria} horas</p>
        <p><strong>Local: </strong> {local}</p>
        </div>
    )
}
    
