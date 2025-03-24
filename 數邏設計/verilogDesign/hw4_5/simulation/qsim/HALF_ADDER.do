onerror {quit -f}
vlib work
vlog -work work HALF_ADDER.vo
vlog -work work HALF_ADDER.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.HALF_ADDER_vlg_vec_tst
vcd file -direction HALF_ADDER.msim.vcd
vcd add -internal HALF_ADDER_vlg_vec_tst/*
vcd add -internal HALF_ADDER_vlg_vec_tst/i1/*
add wave /*
run -all
