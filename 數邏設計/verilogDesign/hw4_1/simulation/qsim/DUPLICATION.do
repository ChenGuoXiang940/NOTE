onerror {quit -f}
vlib work
vlog -work work DUPLICATION.vo
vlog -work work DUPLICATION.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.DUPLICATION_vlg_vec_tst
vcd file -direction DUPLICATION.msim.vcd
vcd add -internal DUPLICATION_vlg_vec_tst/*
vcd add -internal DUPLICATION_vlg_vec_tst/i1/*
add wave /*
run -all
