import '.style.css'
import { useState } from 'react'

export default function Aluno(){

    const [nome, setNome] = useState("Adalberto")
    const [idade, setIdade] = useState(38)
    const [email, setEmail] = useState("a.fgo@gmail.com")
    const [cpf, setCPF] = useState("02394348475")

    return(
        <div className='aluno'>
            <hr />
            <h1>Aluno</h1>
            <p><strong>Nome do Aluno:</strong>{nome}</p>
            <p><strong>Idade do Aluno:</strong>{idade}</p>
            <p><strong>Email do Aluno:</strong>{email}</p>
            <p><strong>CPF do Aluno:</strong>{cpf}</p>
        </div>
    )
}
