const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');

const app = express();
const PORT = 3000;

app.use(bodyParser.urlencoded({ extended: true }));

// Serve static files from the "public" directory
app.use(express.static(path.join(__dirname, 'public')));

// Simple authentication logic
app.post('/login', (req, res) => {
  const { username, password } = req.body;

  // Check if the provided credentials are valid
  if (username === 'akram' && password === 'akram000') {
    res.send('Login successful!');
  } else {
    res.status(401).send('Invalid credentials');
  }
});

app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
