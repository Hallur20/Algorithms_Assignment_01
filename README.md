# Algorithms_Assignment_01

<h1>This project is made by: Hallur vid Neyst, Murched Kayed, Mohammad Saad</h1>
<p>In this project we implemented the three algorithms: Insertsort, Selectionsort and Mergesort. These algorithms are used to sort an arraylist<String> - the ArrayList contains data from a txt.file</p>
<p>In order to run the project, first you need to have jdk8 + their desired environment paths,
	and an IDE such as netbeans or IntelliJ</p>
	
<p>the project already contains the needed file necessary for the sorting, all you have to do is
to go to the main java class and run it. You will get 3 diffirent options to write in the terminal: </p>
	<ul>
		<li>
		insert
		</li>
		<li>
		selection
		</li>
		<li>
		merge
		</li>
</ul>

<h2>Measurement and conclusion</h2>

<p>In our experiences the time consumption have been these:</p>
<ul>
	<li>merge: 3.539 seconds</li>
	<li>insertion: 99 minutes</li>
	<li>selection: 143 minutes</li>
</ul>

<p>The total length of the array that contains the file-data is : 822287 (this was after we removed unnessacery punctuations)</p>
<p> We have also discussed what the worst/best/average cases are for these algorithms and the given array from the file.</p>
<p>In complexity, the (n) represents the size of the array which in our case is 822287.</p>

<h3>Merge</h3>
worstcase: O(N*(log(N)) - O(822287 * log(822287)) = 1.199.421 times.<br/>
bestcase: O(N*(log(N)) - O(822287 * log(822287)) = 1.199.421 times.<br/>
avgcase: O(N*(log(N)) - O(822287 * log(822287)) = 1.199.421 times.<br/>

<p>The result is the same in all cases, because  whatever you do with the Merge Sort algorithm you can't slip from checking every element in the list, that's why it have the same number of complexity in all cases.</p>
	
<h3>Insertion</h3>
worstcase:O(n^2) O(822287^2) = 676.155.910.369 times<br/>
avgcase:O(n^2) O(822287^2) = 676.155.910.369 times<br/>
bestcase:O(n) O(822287) = 8222287 times<br/>

the reason that worst case is in power of 2 is because if the array was reversed, it would take the double amount of time to sort.
the reason that best case is 'n' is because if the array is already sorted, it would take as long time as the length of the array. 

<h3>Selection</h3>

worstcase: O(n2) O(8222872^2) = 676155910369 times<br/>
avgcase:O(n2) O(8222872^2) = 676155910369 times<br/>
bestcase:O(n2) O(8222872^2) = 676155910369 times<br/>

<h3>Conclusion</h3>

The result is the same in all cases, because  whatever you do with the selection Sort algorithm you can't slip from checking every element in the list, that's why it have the same number of complexity in all cases.
