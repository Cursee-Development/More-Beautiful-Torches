import os

def replace_last_occurrence(s, old, new):
    # Find the index of the last occurrence of the target string
    index = s.rfind(old)
    if index == -1:
        return s  # Return the original string if the target string is not found
    # Replace the last occurrence of the target string
    return s[:index] + new + s[index + len(old):]

def replace_string_in_files(folder_path, target_string, replacement_string):
    # Iterate over all files in the specified folder
    for filename in os.listdir(folder_path):
        # Check if the file is a text file
        if filename.endswith(".json"):
            file_path = os.path.join(folder_path, filename)
            print(f"Processing file: {file_path}")

            # Read the content of the file
            with open(file_path, 'r') as file:
                file_content = file.read()

            # Check if the target string is in the file content
            if target_string in file_content:
                print(f"Found '{target_string}' in {file_path}")

                # Replace only the last occurrence of the target string with the replacement string
                new_content = replace_last_occurrence(file_content, target_string, replacement_string)

                # Write the updated content back to the file
                with open(file_path, 'w') as file:
                    file.write(new_content)
                print(f"Replaced last occurrence of '{target_string}' with '{replacement_string}' in {file_path}")
            else:
                print(f"'{target_string}' not found in {file_path}")

# Example usage
folder_path = "recipe"
target_string = "item"  # Escaped quotation marks
replacement_string = "id"  # Escaped quotation marks
replace_string_in_files(folder_path, target_string, replacement_string)
