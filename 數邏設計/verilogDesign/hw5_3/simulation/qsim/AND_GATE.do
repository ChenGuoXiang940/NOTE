onerror {quit -f}
vlib work
vlog -work work AND_GATE.vo
vlog -work work AND_GATE.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.AND_GATE_vlg_vec_tst
vcd file -direction AND_GATE.msim.vcd
vcd add -internal AND_GATE_vlg_vec_tst/*
vcd add -internal AND_GATE_vlg_vec_tst/i1/*
add wave /*
run -all
