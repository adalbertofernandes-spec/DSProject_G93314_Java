// Criando um vetor
const listaNomes = ["Marta", "Jose", "Maria"]

console.log('\nExibindo todos os elemetos: ')
console.log(listaNomes)

console.log('\nExibindo apenas o elemento 1: ')
console.log(listaNomes[0])

// PUSH - Adicionando um elemento
console.log('\nAdicionando apenas um elemento no vetor: ')
listaNomes.push('Pedro')
console.log(listaNomes)

// SHIFT  - Remove o primeiro elemento 
console.log('\nRemovendo o primeiro elemento no vetor')
listaNomes.shift()
console.log(listaNomes)

// POP - remove o ultimo elemento
console.log("\nRemovendo o último elemento no vetor: ")
listaNomes.pop()
console.log(listaNomes)