#!/bin/bash
# Frontend setup script

cd frontend

# Install dependencies
npm install

# Create .env.local file
if [ ! -f .env.local ]; then
    cp .env.example .env.local
    echo "✓ Created .env.local file - please update with your credentials"
fi

echo "✓ Frontend setup complete!"
echo "Run 'npm run dev' to start the development server"
