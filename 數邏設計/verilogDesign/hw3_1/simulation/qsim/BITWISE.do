onerror {quit -f}
vlib work
vlog -work work BITWISE.vo
vlog -work work BITWISE.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.BITWISE_vlg_vec_tst
vcd file -direction BITWISE.msim.vcd
vcd add -internal BITWISE_vlg_vec_tst/*
vcd add -internal BITWISE_vlg_vec_tst/i1/*
add wave /*
run -all
