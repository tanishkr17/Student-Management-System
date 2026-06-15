#!/bin/bash
# Backend setup script

cd backend

# Create virtual environment
python -m venv venv

# Activate virtual environment
if [[ "$OSTYPE" == "msys" || "$OSTYPE" == "cygwin" ]]; then
    source venv/Scripts/activate
else
    source venv/bin/activate
fi

# Install dependencies
pip install --upgrade pip
pip install -r requirements.txt

# Create .env file
if [ ! -f .env ]; then
    cp .env.example .env
    echo "✓ Created .env file - please update with your credentials"
fi

# Initialize database
python -c "from app.db.init import init_db; init_db()"
echo "✓ Database initialized"

echo "✓ Backend setup complete!"
echo "Run 'python main.py' to start the server"
