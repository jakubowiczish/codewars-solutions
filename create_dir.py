import os
import sys


def run():
    number_of_directory_to_go = sys.argv[1]
    directory_name = sys.argv[2]
    link = sys.argv[3]
    prefix = "_" + number_of_directory_to_go + "kyu"
    create_directory_with_readme_file(prefix, directory_name, link)


def create_directory_with_readme_file(prefix, directory_name, link):
    os.chdir("src")
    os.chdir(prefix)
    new_directory_name = prefix + "_" + directory_name
    os.mkdir(new_directory_name)
    os.chdir(new_directory_name)
    readme_file = open("README.md", "w+")
    readme_file.write("## Solution for problem:\r\n")
    readme_file.write(link)
    readme_file.write("\n\n## Instructions")


if __name__ == "__main__":
    run()
