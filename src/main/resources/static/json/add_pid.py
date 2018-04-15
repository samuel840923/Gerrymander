import json
#
with open('kansas.json') as json_data:
    d = json.load(json_data)
count = 0

for i in d["features"]:
    print(i.keys())
    if "pid" not in i:
        i["pid"] = count
        count += 1
    print(i["pid"])

with open('kansas.json','w') as outfile:
    d = json.dump(d,outfile, indent = 1)