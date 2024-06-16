#!/bin/bash
set -e

HOOK_DIR=$(git rev-parse --git-path hooks)
SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

ln -sf "$SCRIPT_DIR/../config/git-hooks/pre-commit" "$HOOK_DIR/pre-commit"
chmod +x "$HOOK_DIR/pre-commit"

echo "Git hooks set up successfully!"