// JavaScript program to reverse a string

function reverseStr(str) {
    // Create an empty string to store the reversed string
    let newStr = "";
  
    // Append each character in reversed order
    for (let i = str.length - 1; i >= 0; i--) {
      newStr = newStr + str[i];
    }
  
    return newStr;
  }
  
  // Original string
  const string = prompt('Enter a string: ');
  
  const reversedString = reverseStr(string); // Call the function to reverse the string
  
  // Print reversed string
  console.log(reversedString);
  