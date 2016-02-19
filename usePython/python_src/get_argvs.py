import sys

print ("filename:", sys.argv[0])

for i in range(1, len(sys.argv)):
	print ("----args", i, ":",sys.argv[i])
	
	
## python get_argvs.py hello world