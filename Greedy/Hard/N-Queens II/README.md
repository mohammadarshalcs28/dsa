# N-Queens II

| Field | Value |
|-------|-------|
| **Platform** | LeetCode |
| **Difficulty** | Hard |
| **Language** | java |
| **Solved On** | September 1, 2026 |
| **Tags** | Backtracking, Algorithm X |
| **Link** | [View Problem](https://leetcode.com/problems/n-queens-ii/) |
| **Runtime** | 0 ms |
| **Memory** | 42.2 MB |

## Problem Description

<p>The <strong>n-queens</strong> puzzle is the problem of placing <code>n</code> queens on an <code>n x n</code> chessboard such that no two queens attack each other.</p>

<p>Given an integer <code>n</code>, return <em>the number of distinct solutions to the&nbsp;<strong>n-queens puzzle</strong></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/queens.jpg" style="width: 600px; height: 268px;">
<pre><strong>Input:</strong> n = 4
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are two distinct solutions to the 4-queens puzzle as shown.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 9</code></li>
</ul>


##  Top Community Optimal Approach

<details>
<summary>Click to expand</summary>

**Title**: [Java/C++] N-Queens 1 && 2 || Almost Same Solution
**Author**: [@hi-malik](https://leetcode.com/hi-malik/)
**Upvotes**: 56 👍
**Link**: [View Original Post](https://leetcode.com/problems/n-queens-ii/solutions/2111857/)

---

**Rules For N-Queens in a chess Board :-**
1. Every Row should Have 1 queen


2. Every Column should have 1 quuen
3. No 2 queens can attack each other

![image](https://assets.leetcode.com/users/images/a69e681e-0067-4c46-8659-f10d126eb181_1654402034.2685366.png)

```
N-Quuens I
```

**Problem Statement:** The n-queens is the problem of placing n queens on n \xD7 n chessboard such that no two queens can attack each other. Given an integer n, return all distinct solutions to the n -queens puzzle. Each solution contains a distinct boards configuration of the queen\u2019s placement, where \u2018Q\u2019 and \u2018.\u2019 indicate queen and empty space respectively.

**Intuition:** Using the concept of Backtracking, we will place Queen at different positions of the chessboard and find the right arrangement where all the n queens can be placed on the n*n grid.

![image](https://assets.leetcode.com/users/images/cad068d6-420e-4588-87cc-ccee4a719323_1654402478.1131492.png)


**Approach:**

**Ist position:** This is the position where we can see no possible arrangement is found where all queens can be placed since, at the 3rd column, the Queen will be killed at all possible positions of row.

![image](https://assets.leetcode.com/users/images/92f73459-712f-4564-a82b-a33364ea38fb_1654401381.1760585.png)

**2nd position:** One of the correct possible arrangements is found. So we will store it as our answer.

![image](https://assets.leetcode.com/users/images/7c6019f5-930c-4fed-bd6b-0f53440db5a9_1654401405.4075787.png)

**3rd position:** One of the correct possible arrangements is found. So we will store it as our answer.

![image](https://assets.leetcode.com/users/images/dd4669ff-be65-40df-88dd-ae1a04442ae5_1654401442.4140863.png)

**4th position:** This is the position where we can see no possible arrangement is found where all queens can be placed since, at the 4th column, the Queen will be killed at all possible positions of row.

![image](https://assets.leetcode.com/users/images/93fc6398-0119-4ba3-82a6-5162845f35fe_1654401463.9854825.png)

<iframe src="https://leetcode.com/playground/MgCvV5hU/shared" frameBorder="0" width="1400" height="1000"></iframe>


ANALYSIS :-
* **Time Complexity:** Exponential in nature, since we are trying out all ways. To be precise it goes as O(N! * N) nearly.

* **Space Complexity:** O(N^2)
```
N-Quuens II
```

This Problem is Almost Similar to N-Queens what extra we have to done over here is, Instead of printing the position we have to **count** the no. of ways in which Queens can be arranged on N-By-N chess 

![image](https://assets.leetcode.com/users/images/c8f00056-d8d7-4965-a879-f3fac38d8bfc_1654399504.9641533.png)

<iframe src="https://leetcode.com/playground/H7a7hggm/shared" frameBorder="0" width="1200" height="800"></iframe>

ANALYSIS :-
* **Time Complexity:** O(N! * N)

* **Space Complexity:** O(N^2)

</details>
