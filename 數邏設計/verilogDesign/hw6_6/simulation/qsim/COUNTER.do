onerror {quit -f}
vlib work
vlog -work work COUNTER.vo
vlog -work work COUNTER.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.COUNTER_vlg_vec_tst
vcd file -direction COUNTER.msim.vcd
vcd add -internal COUNTER_vlg_vec_tst/*
vcd add -internal COUNTER_vlg_vec_tst/i1/*
add wave /*
run -all
