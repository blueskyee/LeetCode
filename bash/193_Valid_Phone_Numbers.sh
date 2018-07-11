#!/bin/bash

while read f; do [[ $f =~ ^([0-9]{3}\-|\([0-9]{3}\)[[:space:]])[0-9]{3}\-[0-9]{4}$ ]] && echo $f; done < ./193.input

# match space in string: [[:space:]]
# [[ $f =~ ^[0-9]{3}\-[0-9]{3}\-[0-9]{4}$ ]] && echo $f
# [[ $f =~ ^\([0-9]{3}\)[[:space:]][0-9]{3}\-[0-9]{4}$ ]] && echo $f

