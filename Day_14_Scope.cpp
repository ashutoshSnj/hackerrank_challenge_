#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Difference {
    private:
    vector<int> elements;
  
  	public:
  	int maximumDifference;
 
    Difference(vector<int> elems) {
        elements = elems;
    }

    
    void computeDifference() {
        int maxElem = *max_element(elements.begin(), elements.end());
        int minElem = *min_element(elements.begin(), elements.end());
        maximumDifference = abs(maxElem - minElem);
    }

	

}; // End of Difference class

int main() {
    int N;
    cin >> N;
    
    vector<int> a;
    
    for (int i = 0; i < N; i++) {
        int e;
        cin >> e;
        
        a.push_back(e);
    }
    
    Difference d(a);
    
    d.computeDifference();
    
    cout << d.maximumDifference;
    
    return 0;
}