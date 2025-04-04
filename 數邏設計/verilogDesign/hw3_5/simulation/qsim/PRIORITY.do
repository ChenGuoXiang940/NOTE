onerror {quit -f}
vlib work
vlog -work work PRIORITY.vo
vlog -work work PRIORITY.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.PRIORITY_vlg_vec_tst
vcd file -direction PRIORITY.msim.vcd
vcd add -internal PRIORITY_vlg_vec_tst/*
vcd add -internal PRIORITY_vlg_vec_tst/i1/*
add wave /*
run -all
