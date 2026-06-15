# Campus Intelligence Platform

A full-stack AI-enabled platform combining a digital twin of campus, intelligent knowledge search, and an AI assistant to enhance student and staff experience.

## Features

- **Interactive Campus Map** - Real-time campus visualization with building occupancy
- **Class Occupancy Prediction** - ML-based predictions for classroom availability
- **Lost-and-Found Tracking** - Location-based lost item discovery
- **Event Recommendations** - Personalized campus event suggestions
- **Natural Language Campus Search** - RAG-powered semantic search over campus knowledge
- **Student Q&A Assistant** - AI chatbot answering campus-specific questions

## Tech Stack

### Frontend
- React + TypeScript
- Leaflet/OpenStreetMap (geospatial visualization)
- TailwindCSS (styling)
- Zustand (state management)

### Backend
- FastAPI (async Python)
- PostgreSQL (relational data)
- Supabase Vector (pgvector for embeddings)
- LLM APIs (OpenAI/Anthropic)

### Infrastructure
- Vercel (frontend deployment)
- Railway/Render (backend deployment)
- Redis (caching)

## Project Structure

```
├── backend/                  # FastAPI application
│   ├── app/
│   │   ├── api/             # API endpoints
│   │   ├── models/          # Pydantic models
│   │   ├── services/        # Business logic
│   │   ├── db/              # Database utilities
│   │   └── config.py
│   ├── requirements.txt
│   └── main.py
├── frontend/                 # React application
│   ├── src/
│   │   ├── components/      # React components
│   │   ├── pages/           # Page routes
│   │   ├── hooks/           # Custom hooks
│   │   ├── stores/          # Zustand stores
│   │   └── utils/           # Utilities
│   └── package.json
└── docs/                     # Documentation
    ├── API.md
    ├── DATABASE.md
    └── SETUP.md
```

## Getting Started

### Prerequisites
- Python 3.10+
- Node.js 18+
- PostgreSQL 14+
- API keys: OpenAI (or Anthropic)

### Quick Start

**Backend:**
```bash
cd backend
python -m venv venv
source venv/bin/activate
pip install -r requirements.txt
python main.py
```

**Frontend:**
```bash
cd frontend
npm install
npm run dev
```

## Documentation

- [API Documentation](./docs/API.md)
- [Database Schema](./docs/DATABASE.md)
- [Setup Guide](./docs/SETUP.md)

## Roadmap

### Phase 1: MVP
- [ ] Backend scaffolding
- [ ] Campus data models
- [ ] Vector DB setup
- [ ] Interactive map component
- [ ] Basic knowledge ingestion

### Phase 2: Core Features
- [ ] AI Assistant with RAG
- [ ] Occupancy prediction model
- [ ] Lost & Found tracker
- [ ] Event recommendations

### Phase 3: Polish
- [ ] Deployment pipeline
- [ ] Performance optimization
- [ ] UI refinement

## License

MIT
