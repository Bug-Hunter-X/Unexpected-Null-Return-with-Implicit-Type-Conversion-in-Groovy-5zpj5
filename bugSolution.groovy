```groovy
def myMethod(a, b) {
  // Explicitly check for nulls and handle appropriately
  a = a ?: 0 // Use the Elvis operator for null-safe defaulting
  b = b ?: 0

  return a + b
}

println myMethod(5, null) // Output: 5
println myMethod(null, 5) // Output: 5
println myMethod(5, 5)   // Output: 10
```