
Coordination Mechanisms
____________________________________________________________________________
	Questions 	: https://tinyurl.com/ydylpn64
	Discussions	: https://tinyurl.com/y8y6lc3a

	Must Share Your PRIMARY GMAIL ID
	Documents Will Be Shared ONLY ON your PRIMARY GMAIL ID

Hardware/Software Requirements
____________________________________________________________________________
	Computer/Laptop with 8GB+ RAM and Minimum Core i5 Processor
	Operating System: Ubuntu 20.04, 64 Bit [ Desktop Edition ]	
	SDK: Oracle Java Development Kit(JDK) 9+
	Editors: Sublime Text, Visual Code
		Design For Programmers
		Light Weight
		Cross Platform [ Linux, MacOSX and Windows ]

	Install on Virtualisation Environment e.g. Oracle VirtualBox

Setup Environment
____________________________________________________________________________
	1. Virtual Environment Easy Maintain.
	2. Must Have Same Environment: Ubuntu 20.04, 64 Bit [ Desktop Edition ].
	3. Unix/Linux Part of Agenda
	4. Design Perceptive 

Set of Nodes Childern of intelligene
____________________________________________________________________________
	Applications			Huawei.Router.Details.txt	Public
	Calibre Library			Library				contact.txt
	CallDetails.txt			Movies				fibo.swift
	Desktop				Music				hello.swift
	Documents			NITCAAEmailID.txt		someData
	Downloads			Pictures			temp

	 /Users/intelligene

	Parent of intelligene is Users
	Parents of Users / [ Root Directory ]

	In Case Windows What is The Root Directory?
		 - C: Drive
		 - 
		 e.g. In Mac World
				Achieve	 | C:
				Aspire	 | D:
				Inspire  | E:
				MacOSX   | H:
				
				Parent of These One Is Volumes
				Volumes has parent /

	Design Questions
		Should you start your filesystem design with 
			DESIGN CHOICE: 
				One Node or Multiple Node
		Which Design Choice Is Better? and Why?

Training Pedagogy
____________________________________________________________________________
	Design Oriented


ANY QUESTION or DOUBT?
____________________________________________________________________________
	Feel Free To Ask....

	
____________________________________________________________________________
Unix OS 
	Ken Thomson and Denish Ritchie
	Assembly Language
	Created C Language, Inspired From Language B 


ls : List Immediate Child Nodes
	ls command with Options/Switches
		ls -l : Detailed Listing
		ls -a : Shows all files Including Hidden
	
	Order Doesn't Matters
		ls -l -a
		ls -a -l
		ls -al
		ls -la 

	Colored Output
		ls -lG

pwd : Present Working Directory

____________________________________________________________________________

In Unix Everything Is File 
	Files and File Type In Unix 
	
	Experiment Commands
		ls  -l

		drwx------@  4 intelligene  staff   170 Nov 27 15:36 Applications
			Directory File: Metadata About Other Files 

		-rw-r--r--   1 intelligene  staff   244 Jul  9  2019 contact.txt
			Regular File

		First Character is d or -

	Experiment Commands
		cd /dev
		ls -l

		crw-------  1 intelligene  staff       0,   0 Apr 28 08:54 console
			Character File: File Which is Read/Written Character By Character

		brw-r-----  1 root         operator    1,   0 Apr 28 08:43 disk0
			Block File: File Which is Read/Written Block By Block
			Block Size: 512 Bytes

		First Character is c or b

		File Size is 1024 Bytes -> 2 Block Sizes
			Block Size: 512 Bytes

	The file mode printed under the -l option consists of the entry type, owner permis-
     sions, and group permissions.  The entry type character describes the type of file,
     as follows:

           b     Block special file.
           c     Character special file.
           d     Directory.
           		mkdir FileName

           -     Regular file.
           		touch FileName

           l     Symbolic link.
           s     Socket link.
           p     FIFO.

____________________________________________________________________________
Discussion Questions
	What is A File?
____________________________________________________________________________


Path Concept 
____________________________________________________________________________
	Path: Branch In Tree Ending at Node
		
	Terminal Node: Documents
	Root Node: / (Root)

	Absolute Path: Path Starting From / Node
		/Users/intelligene/Documents

		cd /Users/intelligene/Documents

	Relative Path: Path Relative to Present Working Directory
		cd Documents

	Nodes Coming In Branch/Path
		/
		Users
		intelligene
		Documents

	Traversal: Bi Directional
		Child To Parent 
		cd .. : Move to Immediate Parent Node
		cd .  : Remain In Current Node(Directory)
	
		Parent To Child
		cd PATH 
		cd ./Documents/Trainings/

	Change To Home Directory
		cd ~
		cd 
____________________________________________________________________________
Creation of Nodes
	mkdir NODE
	mkdir -p PATH
		Creates BRNACH starting from FIRST NODE If It Doesn't Exists
	touch NODE 
	
	cp NODE 
	cp -r NODE

	mv SOURCE_PATH/NODE DEST_PATH/NODE
		Changes Parent Node
		SOURCE_PATH and DEST_PATH Are Same: Used For Renaming

Deletion of Nodes 
	Deletes Single Node
	___________________ 
	rm NODE 
	rmdir NODE 
		Removes Empty Directory Node
	
	Deletes Branch Provided Every Node is Empty
	rmdir -p PATH
		Removes Branch Starting From FIRST NODE OF PATH

	Deletes All Branches
	rm -R NODE 
		Subtree including Parent NODE

____________________________________________________________________________
Log Files
	/var/log/syslog

	10 Lines Of Files Starting/Ending
		head FILE
		tail FILE 
____________________________________________________________________________
File Permission Model
	POSIX Permission Model
	- rw- r-- r--   1 intelligene  staff   244 Jul  9  2019 contact.txt
		Regular File

		 Creator	Friends		Others
		 _____________________________ 
         Owner  	Group 		Others
         User
		 RWX		RWX   		RWX

		-rw-r--r--  1 intelligene  staff  0 Apr 28 12:34 AnushkaSharma
		intelligene staff   others
		rw 			r 		r

	Paranoid Approach
	____________________________________________________________________________
	Owner  	Group 		Others
	RW      R           R 

	RWX
	
	000	0
	001	1 EXECUTE
	010	2 WRITE
	011 3	
	100	4 READ
	101	5
	110	6
	111	7

	4 READ
	2 WRITE
	1 EXECUTE

	chmod u+x FILE
____________________________________________________________________________
System Design Thinking
____________________________________________________________________________
	Privileage Design
		Never Ever Should Be Given By Name
	Scope Design
		Never Ever Should Be BROADEST
		Narrowest Scope First, Then Broader, Then Broader...

____________________________________________________________________________
Email: Sunny Leone On Beach!
	SunnyLeone.jpg
		It's Virus 

	Force To Download Scripts
		It's Not Virus 
		SunnyLeone.jpg > SunnyLeone.exe 
		Copy In Some Hidden Folder
		Hide Folder System Wide

System Configuration
____________________________________________________________________________
	Terminal Environment
	env
	export DING_DONG="Balleeee Balleeee"
	export PATH=$PATH:/Users/intelligene/Documents/FlipkartBatch/Heroines

	What is Terminal?
		Session To The OS
	What is Shell?
		Language Interpreter

	Configure System
		Session Level
		
		User Level: Applicable To All Sessions < 
			~/.bashrc
		
		System Level
			/etc/bashrc

	Scope Design
		Never Ever Should Be BROADEST
		Narrowest Scope First, Then Broader, Then Broader...


Vim Editor : Mode Based Editor
____________________________________________________________________________
~/.vimrc

Command Mode -----> i ----> Insert Mode
Command Mode <---- Esc----- Insert Mode
Command Mode -----> Shift+V ----> Visual Line Mode
Command Mode -----> Ctrl+V ----> Visual Block Mode

Command Mode
	/SearchCriteria After Forwards Slash
	n Go To Next Search Item
	N Go To Previous Search Item

	Shift :
	:w  Write To File
	:q  Quit 
	:q! Quit Without Saving

	:wq Write and Quit

	yy  Current Line Yanking
	p   Pasting

	Nyy N lines Yanked/Copied
	p 	N lines Pasted

	dd Current Line Deleted
	u  Undo
 	ctrl+r Redo
	Ndd N lines Deleted 

	:set number To Show Line Numbers
	:set nonumber To Disable Line Numbers
	
	:%s/SOURCE_TEXT/SUSTITUTE_TEXT/gc   
		g means globally whole file and c means confirmation

Learning and Practicing Vim Basics
____________________________________________________________________________
	vimtutor


printf or scanf
____________________________________________________________________________
	printf Writes To A File: stdout
		By Default stdout file is pointing to terminal file

		cat AmirKhan
			write content to stdout file ->  /dev/ttys0000

		cat AmirKhan > DingDong
			write content to DingDong file 

	scanf Reads From A File: stdin
		By Default stdout file is pointing to standard keyboard

		





















____________________________________________________________________________
From saurav anand to Everyone: (02:22 PM)
 sir rw-rwxrwx is not making the file run 
From Anil Bansal to Everyone: (02:22 PM)
 if the execute permission is given to others then will the owner be able to execute it? 
From saurav anand to Everyone: (02:22 PM)
 bur x permission is with grp

















