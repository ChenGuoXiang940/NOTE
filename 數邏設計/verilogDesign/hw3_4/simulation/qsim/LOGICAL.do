onerror {quit -f}
vlib work
vlog -work work LOGICAL.vo
vlog -work work LOGICAL.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.LOGICAL_vlg_vec_tst
vcd file -direction LOGICAL.msim.vcd
vcd add -internal LOGICAL_vlg_vec_tst/*
vcd add -internal LOGICAL_vlg_vec_tst/i1/*
add wave /*
run -all
