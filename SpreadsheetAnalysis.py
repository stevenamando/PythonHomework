from os import listdir
from os.path import isfile, join

target_dir = "c://temp"
onlyfiles = [f for f in listdir(target_dir) if isfile(join(target_dir, f))]
print(len(onlyfiles))

all_lines = []
for file in onlyfiles:
	with open(file) as f:
		lines = f.readlines()
		all_lines = all_lines + lines

# print(all_lines)

with open(join(target_dir, join("new dir", "output.txt")), "W") as outFile:
    for line in all_lines:
        outFile.write(line)


