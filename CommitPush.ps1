Add-Type -AssemblyName Microsoft.VisualBasic

# GUI Input Box
$commitMessage = [Microsoft.VisualBasic.Interaction]::InputBox("Enter your commit message:", "Git Commit Prompt", "updated problem solution")

if ($commitMessage -eq "") {
    Write-Host "❌ Commit message is empty. Aborting..."
    exit
}

# Git commands
git add .

try {
    git commit -m "$commitMessage"
} catch {
    Write-Host "⚠️ Nothing to commit or error occurred."
}

try {
    git push
    Write-Host "✅ Code pushed successfully."
} catch {
    Write-Host "❌ Push failed. Check your remote or authentication."
}
