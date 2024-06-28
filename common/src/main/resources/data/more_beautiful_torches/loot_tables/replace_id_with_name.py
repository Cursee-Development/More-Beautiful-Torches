import os

def replace_string_in_files(folder_path, target_string, replacement_string):
    # Iterate over all files in the specified folder
    for filename in os.listdir(folder_path):
        # Check if the file is a text file
        if filename.endswith(".json"):
            file_path = os.path.join(folder_path, filename)

            # Read the content of the file
            with open(file_path, 'r') as file:
                file_content = file.read()

            # Replace the target string with the replacement string
            new_content = file_content.replace(target_string, replacement_string)

            # Write the updated content back to the file
            with open(file_path, 'w') as file:
                file.write(new_content)

# Example usage
folder_path = "blocks"
target_string = "id"  # Escaped quotation marks
replacement_string = "name"  # Escaped quotation marks
replace_string_in_files(folder_path, target_string, replacement_string)
