import { use, useState } from 'react'
import './style.css'

export default function AdicionarAluno(){
    // Criando e inicializando as variaveis
    const [nome, setNome] = useState('')
    const [email, setEmail] = useState('')

    // Criando uma lista para adicionar os nomes dos alunos
    const [listaAlunos , setListaAlunos] = useState([])

    // Funcão para adicionar dados do aluno na lista de aluno.
    const addAluno = (event) => {
        event.preventDefault()
        if (nome && email) {
            /*
            Add os dados anteriores + novos dados
            ... distribua um de cada vez
            */ 
            setListaAlunos([...listaAlunos, {nome, email}])
            // Define o valor dos campos como vazio novamente.
            setNome('')
            setEmail('')
        }
    }

    //HTML
    return(
        <div>
            <h2>Adicioonar Aluno</h2>
            <form onSubmit={addAluno}>
                <input 
                    type='text'
                    placeholder='Nome'
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}    
                />
                <input 
                    type='text'
                    placeholder='Email'
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}    
                />

                <button type='submit'>Adicionar</button>
            </form>


            <hr />

            <h3>Matriculados</h3>
            <ul>
                {listaAlunos.map((aluno, index) => (
                    <ol key={index}>{aluno.nome} - {aluno.email}</ol>
                ))}
            </ul>
        </div>
    )
}