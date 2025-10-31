import { useState } from 'react'
import './App.css'
import Mensagem from './components/Mensagem'
import InfoCurso from './components/InforCurso'
import Aluno from './components/Aluno'

function App() {
  const [] = useState(0)

  return (
    //Fragment.
    <>
      <h1>Hello Word!!!</h1>
      <Mensagem />
      <Mensagem />
      <Mensagem />
      <InfoCurso />
      <Aluno />
    </>
  )
}

export default App
