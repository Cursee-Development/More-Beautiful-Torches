import os

def replace_string_in_files(folder_path, target_string):
    # Iterate over all files in the specified folder
    for filename in os.listdir(folder_path):

        # Check if the file is a text file
        if filename.endswith(".json"):
            file_path = os.path.join(folder_path, filename)

            # print(filename)


            # Read the content of the file
            with open(file_path, 'r') as file:
                file_content = file.read()

            # Replace the target string with the replacement string

            replacement_string = f"more_beautiful_torches:blocks/{filename.replace(".json", "")}"
            new_content = file_content.replace(target_string, replacement_string)

            # Write the updated content back to the file
            with open(file_path, 'w') as file:
                file.write(new_content)

# Example usage
folder_path = "blocks"
target_string = "minecraft:blocks/torch"  # Escaped quotation marks
#replacement_string = "more_beautiful_torches:blocks/"  # Escaped quotation marks
# replace_string_in_files(folder_path, target_string, replacement_string)
replace_string_in_files(folder_path, target_string)
