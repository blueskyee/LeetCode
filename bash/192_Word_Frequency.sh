#!/bin/bash

# tr -s: 去除重複只有第一個; sort -n(numerical) -k2(by 第二個欄位) -r(reverse order)
cat ./input/192.input | tr '\n' ' ' | tr -s " " | tr ' ' '\n' | sort | uniq -c | sort -nk2 -r | awk '{print $2" "$1}'

#echo 'a  a   b' | tr -s " " | tr ' ' '\n' | sort | uniq -c | awk '{print $2" "$1}'
#echo 'a  \n b  c   \n  c    b  c' | tr '\n' ' ' | tr -s " " | tr ' ' '\n' | sort | uniq -c | sort -nk2 -r | awk '{print $2" "$1}'
