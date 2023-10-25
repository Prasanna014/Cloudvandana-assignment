function reverse(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

const originalSentence = "this is a sunny day";
const reversedSentence = reverseWords(originalSentence);

console.log("Original Sentence:", originalSentence);
console.log("Reversed Sentence:", reversedSentence);
