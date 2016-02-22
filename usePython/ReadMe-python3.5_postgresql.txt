1. install Psycopg2 for Python 3.5
	从 http://www.lfd.uci.edu/~gohlke/pythonlibs/ 下载非官方的whl（Psycopg）包 
    Unofficial Windows Binaries for Python Extension Packages
2. install the downloaded .whl files.
     	pip install SomePackage-1.0-py2.py3-none-any.whl
    	----------------------------------------------------
     	F:\python2016\Anaconda3__python3_5> pip install  F:\python2016\Python_Lib\no_official\psycopg2-2.6.1-cp35-none-win_amd64.whl
     	Processing f:\python2016\python_lib\no_official\psycopg2-2.6.1-cp35-none-win_amd64.whl
     	Installing collected packages: psycopg2
     	Successfully installed psycopg2-2.6.1
     	
    https://pip.pypa.io/en/latest/user_guide/#installing-from-wheels
    pip install SomePackage-1.0-py2.py3-none-any.whl
    
    
	通过 pip列表安装包
    $ pip list
	docutils (0.9.1)
	Jinja2 (2.6)
	Pygments (1.5)
	Sphinx (1.1.2)

	通过pip卸载安装包
	$ pip uninstall SomePackage
	