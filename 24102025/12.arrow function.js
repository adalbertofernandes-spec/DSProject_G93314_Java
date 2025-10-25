// Funcao

// funcao uma função para subtrair, multiplicar e dividir os numeros

function somar(a, b){
    return a + b
}
// Arrow Function
const soma = somar(2,3)
console.log(`Função Soma: ${soma}`)

function subtrair(a, b){
    return a - b 
}

const subtracao = subtrair(2,3)
console.log(`Função Subtrair: ${subtracao}`)

// Metodologia de mudança
const multiplicacao = ( a, b ) => a * b
const resultado = multiplicacao(2,5)
console.log(resultado)

// Modalidade de saida
const divisao = (a, b) => {
    
    if (a == 0 || b == 0){
        return ('Esse valor não pode ser divido')
    }

    return a /b
}

const resultado1 = divisao(5,5)
console.log(resultado1)