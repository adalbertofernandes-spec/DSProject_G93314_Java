// Atividade

// Vetor de números
const numeros = [1, 2, 3, 4, 5]
const mult = 2


// Apresente todos os números do vetor 'numeros'
console.log('\nRetornando os numeros da lista')
const numeros1 = numeros.map(n => n)
numeros.forEach((numeros, index) => 
console.log(`${++index}º numero: ${numeros}`)
)
console.log(numeros)

// Multplicador pela const mult.
console.log('\nMultiplicando o valor por 2');
const numeros2 = numeros.map(n => n * mult); 
numeros2.forEach((num, index) => {
  console.log(`${++index}º valor: ${num}`);
});

console.log(`\nValores multiplicados por ${mult}x:`, numeros2)

// Mostre apenas os números pares.
console.log('\nNúmeros pares');
const numeros3 = [1, 2, 3, 4, 5]; 
const numerosPares = numeros.filter(n => n % 2 === 0);

console.log(numerosPares);



// Apresente a soma de todos os números da lista.
console.log("\nSomando os valores da lista")
const somaNumeros = numeros.reduce((soma, n) => soma + n, 0)
console.log(`Soma dos valores da lista é: ${somaNumeros}`)
