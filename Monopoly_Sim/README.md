# Monopoly_Sim

Textual Monopoly simulator implemented in Java. This project implements core Monopoly mechanics (dice, piece movement around the board, Chance and Community Chest cards, property ownership and basic transactions) with the goal of running large batches of simulated games and collecting statistics to determine which properties are most valuable or risky.

## Current status
- Core simulation framework (textual only — no GUI).
- Dice rolling and player movement around the board.
- Handling of Chance and Community Chest cards (textual effects).
- Property ownership, buying, and simple rent mechanics.
- Logging of game events to produce post-game statistics.

## Project goals
Primary goal: run thousands of simulated games and aggregate results to answer questions such as:
- Which properties are landed on most often?
- Which properties give the best return on investment?
- Which properties should be avoided?

Longer-term goals:
- Implement configurable AI player strategies (aggressive buyer, conservative buyer, trading behavior) and compare outcomes.
- Add more detailed financial rules, auctions, trading, houses/hotels.
- Produce exportable analytics (CSV/JSON) and visualizations outside the simulator.

## Getting started
- The code lives under `src/`. Dependencies (if any) are in `lib/`. Compiled output is typically produced in `bin/` by your build/run workflow.
- Build and run using your preferred Java tooling (IDE run configuration or javac/java). Run the main simulation entry point (e.g., the project's main class) to start simulations.
- Configure simulation parameters (number of games, number of players, random seed, player behaviors) via the provided configuration mechanism in code or command-line arguments (see the simulation main class for details).

## Running large simulations and gathering results
- Run the simulator repeatedly or in batch mode to collect aggregate statistics. The simulator emits textual logs and summary statistics; extend or adapt the exporter for CSV/JSON if you want to analyze results in spreadsheets or data tools.
- Use different AI/player strategy implementations to compare outcomes across play styles.

## Contributing
- Implementations, bug fixes, new player strategies, and analysis/export improvements are welcome.
- Keep changes focused and add tests or reproducible runs for new behaviors.

## Notes
- This is a work-in-progress aiming for reproducible, large-scale text-based Monopoly simulations. No graphical UI is included or planned in the short term.
