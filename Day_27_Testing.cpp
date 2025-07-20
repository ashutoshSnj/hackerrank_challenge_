#include <bits/stdc++.h>
using namespace std;

int minimum_index(const vector<int>& seq) {
    if (seq.empty()) {
        throw invalid_argument("Cannot get the minimum value index from an empty sequence");
    }
    int min_idx = 0;
   for (size_t i = 1; i < seq.size(); ++i) {

        if (seq[i] < seq[min_idx]) {
            min_idx = i;
        }
    }
    return min_idx;
}

struct TestDataEmptyArray {
    static vector<int> get_array() {
        return {};
    }
};


struct TestDataUniqueValues {
    static vector<int> get_array() {
        return {5, 8, 3, 9, 4}; 
    }

    static int get_expected_result() {
        return 2; 
    }
};


struct TestDataExactlyTwoDifferentMinimums {
    static vector<int> get_array() {
        return {5, 1, 3, 1, 4}; 
    }

    static int get_expected_result() {
        return 1; 
    }
};


void assertEquals(int expected, int actual) {
    if (expected != actual) {
        cout << "Assertion failed: expected " << expected << ", got " << actual << endl;
        exit(1);
    }
}

int main() {
    
    try {
        auto seq = TestDataEmptyArray::get_array();
        minimum_index(seq);
        cout << "TestDataEmptyArray: Exception not thrown!" << endl;
    } catch (invalid_argument& e) {
        cout << "TestDataEmptyArray: Passed (exception caught)\n";
    }

    
    {
        auto seq = TestDataUniqueValues::get_array();
        int expected = TestDataUniqueValues::get_expected_result();
        int result = minimum_index(seq);
        assertEquals(expected, result);
        cout << "TestDataUniqueValues: Passed\n";
    }

    
    {
        auto seq = TestDataExactlyTwoDifferentMinimums::get_array();
        int expected = TestDataExactlyTwoDifferentMinimums::get_expected_result();
        int result = minimum_index(seq);
        assertEquals(expected, result);
        cout << "TestDataExactlyTwoDifferentMinimums: Passed\n";
    }

    return 0;
}
