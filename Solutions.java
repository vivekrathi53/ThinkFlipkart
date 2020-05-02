DAY 4: 
	ASSIGNMENT 1
	____________________________________________
	Write Sum Function In C Language

	// Which Will Return Valid SUM For ANY X, Y
	// Otherwise Print Can't Calculate SUM

	int sum(int x, int y) {
		if((x>0&&x>INT_MAX-y)||(x<0&&x>INT_MIN-y))
		{
			printf("Can't Calculate the SUM n");
			exit(1);// non zero value indicates error -- we can set specify a particluar number denotes some particular error 
		}
		return (x+y);
	}

	ASSIGNMENT 2
	____________________________________________
	Write Sum Function In C Language

	// Which Will Return Valid SUM For ANY X, Y
	// Otherwise RETURN ERROR

	int sum(int x, int y) {

	}

	PROVE YOUR CODE IS RIGHT OR WRONG
		REASON WITH DEFINITION
			DATA TYPE

	Fundamental Thinking
	____________________________________________________________________________
	OverFlow And Underflow
		Fundamental Part of System [Finite]

	What is Far More Fundamental 
		Value or Type
		Variable


	Type is more fundamental because value is always binary for a computer, type is used to take out the meaning
	from it.


	Language Designer Thinking
	____________________________________________________________________________
		Language Design
			Ballee Balleee Language
		
		Data Type
			int In Balleee Ballee
				Which Design You Will Prefer and Why?

		Ans: I would prefer to have char as a data type if only one is allowed so that 
			it could then generate all other data types by itself.
		// Still a doubt - If we take integer then how will we represent floating point numbers, strings etc?
	____________________________________________________________________________

	READING ASSIGNMENT [ MUST ]// not given in chatper 1 -- checkonce more
	____________________________________________________________________________
		Data Type Chapter1
			Programming In C, 2nd Edition
				By Kernigham and Denish Ritchie.

	____________________________________________________________________________
	Prove Following Identities Are True/False?
		Prove Int In C = Int In Java?
		Prove Int In Java = Int In C++?
			Java int is same everywhere whereas in C int will change according to architecture of system.
			for eg. in 16 bit system, c int is 16 bit max, whereas for java it will remain same(32 bit).
			similar case with c++.
		
		Prove Int In C = Int In C++?

			they are same if same a = consider same architecture


	Prove Above Results For float, double, long, char also

	Floating Point Numbers
	____________________________________________________________________________
	https://en.wikipedia.org/wiki/Single-precision_floating-point_format

	23 bit fraction, 8bit exponent, 1bit sign
	Exponent		fraction = 0			fraction ≠ 0
	FFH				±infinity				NaN (quiet, signalling)
	This gives from 6 to 9 significant decimal digits precision
	If a decimal string with at most 6 significant digits is converted to IEEE 754 single-precision representation,
	and then converted back to a decimal string with the same number of digits, the final result should match the 
	original string. If an IEEE 754 single-precision number is converted to a decimal string with 
	at least 9 significant digits, and then converted back to single-precision representation, 
	the final result must match the original number.
-------------------------------------------------------------------------------------
Example on /* Single-precision_floating-point_format */
	consider 0.375
	b1 = 0.375*2 = 0.750 --> 0
	b2 = 0.750*2 = 1.5 --> 1
	b3 = 0.5*2 = 1.0 --> 1
	base10(0.375) = base2(0.011) = 1.1*2^(-2);
	therefore 
		exponent = 127 + (-2) = 125
		sign = 0 (+ve)
		fraction = 10000000000000000000000
--------------------------------------------------------------------------------------



	https://en.wikipedia.org/wiki/Double-precision_floating-point_format

	52 bit fraction, 11 bit exponent, 1 bit sign
	Exponent		fraction = 0			fraction ≠ 0
	FFH				±infinity				NaN (quiet, signalling)
	The 53-bit significand precision gives from 15 to 17 significant decimal digits precision 
	(2^(−53) ≈ 1.11 × 10^(−16)).
	if a decimal string with at most 15 significant digits is converted to IEEE 754 double-precision representation,
	and then converted back to a decimal string with the same number of digits, the final result should match the 
	original string. If an IEEE 754 double-precision number is converted to a decimal string with at least 17 
	significant digits, and then converted back to double-precision representation, the final result must match 
	the original number.


++++++++++++++++++++++++++++++++++++++++++++++++++++++
--> RAISE HAND IF DONE READING AND PRACTICE ASSIGNMENT 
++++++++++++++++++++++++++++++++++++++++++++++++++++++
